/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifms.ws1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NVIDIA
 */
public class converteDefinition {

    public List<Definicao> ConvertDefinition(List<Definition> listDefine) {
        List<Definicao> listDefinicao = new ArrayList();
        if (listDefine.size() > 0) {
            for (Definition definition : listDefine) {
                Definicao def = new Definicao();
                def.setPalavra(definition.word);
                def.setDefinicao(definition.wordDefinition);
                listDefinicao.add(def);
            }
        }
        return listDefinicao;
    }
}
