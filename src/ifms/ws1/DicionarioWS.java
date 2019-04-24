/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifms.ws1;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NVIDIA
 */
@WebService
public class DicionarioWS {

    dicionarioDAO dicDAO = new dicionarioDAO();

    @WebMethod(operationName = "BuscarDefinicaoWSMyWords")
    @WebResult(name = "DefinicaoWSMyWords")
    public List<Definicao> buscarWSMyWords(String palavra) {
        List<Definicao> listFinal = new LinkedList();
        converteDefinition conv = new converteDefinition();
        ArrayOfDefinition definition = new ArrayOfDefinition();
        ifms.ws1.DictService service = new ifms.ws1.DictService();
        ifms.ws1.DictServiceSoap port = service.getDictServiceSoap();
        if (port.define(palavra).definitions.definition.size() > 0) {
            listFinal = conv.ConvertDefinition(port.define(palavra).definitions.definition);
        }

        return listFinal;
    }

    @WebMethod(operationName = "BuscarDefinicaoMyDictionary")
    @WebResult(name = "DefinicaoMyDictionary")
    public List<Definicao> buscarMyDictionary(String palavra) {
        List<Definicao> listFinal = new LinkedList();
        dicDAO = new dicionarioDAO();
        try {
            listFinal = dicDAO.buscarDefinicoesSalvas(palavra);
        } catch (SQLException ex) {
            Logger.getLogger(DicionarioWS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listFinal;
    }

    @WebMethod(operationName = "ListarTodasDefinicoesBD")
    @WebResult(name = "listTodos")
    public List<Definicao> listarTodos() {
        List<Definicao> listTodos = new LinkedList();
        dicDAO = new dicionarioDAO();

        try {
            listTodos = dicDAO.listarDefinicoesSalvas();
        } catch (SQLException ex) {
            Logger.getLogger(DicionarioWS.class.getName()).log(Level.SEVERE, null, ex);

        }
        return listTodos;
    }

    @WebMethod(operationName = "AddDefinicaoBD")
    public void addDefinicaoBD(Definicao definicao) {
        try {
            dicDAO.add(definicao);
            System.out.println("sucess");
        } catch (SQLException ex) {
            System.out.println("error" + ex.getMessage());
            Logger.getLogger(DicionarioWS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
