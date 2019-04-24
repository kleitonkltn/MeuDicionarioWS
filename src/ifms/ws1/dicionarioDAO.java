/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifms.ws1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NVIDIA
 */
public class dicionarioDAO {

    private Connection conexao;
    private FabricaConexao fabricaConexao;

    public dicionarioDAO() {
        fabricaConexao = new FabricaConexao();
        conexao = fabricaConexao.getConexao();
    }

    public void add(Definicao definicao) throws SQLException {

        try {

            conexao.setAutoCommit(false);
            String query = "INSERT INTO definicoes(palavra, definicao) VALUES(?,?)";
            PreparedStatement st = conexao.prepareStatement(query);
            st.setString(1, definicao.getPalavra());
            st.setString(2, definicao.getDefinicao());
            st.execute();
            System.out.println(st.toString());
            conexao.commit();
        } catch (SQLException ex) {
            
            System.out.println(ex.getMessage());
            conexao.rollback();
            throw ex;

        }
    }

    public List<Definicao> listarDefinicoesSalvas() throws SQLException {

        List<Definicao> definicaoList = new ArrayList<>();
        String sql = "SELECT * FROM definicoes";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ResultSet rs = ps.executeQuery(sql);

        Definicao d;
        while (rs.next()) {
            d = new Definicao();
            d.setId(rs.getInt("id"));
            d.setPalavra(rs.getString("palavra"));
            d.setDefinicao(rs.getString("definicao"));

            definicaoList.add(d);
        }

        return definicaoList;
    }

    public List<Definicao> buscarDefinicoesSalvas(String palavra) throws SQLException {
        PreparedStatement ps = null;

        List<Definicao> definicaoList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM definicoes as def WHERE def.palavra = ?";
            ps = conexao.prepareStatement(sql);
            ps.setString(1, palavra);
            ResultSet rs = ps.executeQuery();

            Definicao d;
            while ((rs != null) && (rs.next())) {
                d = new Definicao();
                d.setId(rs.getInt("id"));
                d.setPalavra(rs.getString("palavra"));
                d.setDefinicao(rs.getString("definicao"));
                definicaoList.add(d);
            }
        } catch (SQLException e) {

            System.out.println(e.getMessage());

        } finally {

            if (ps != null) {
                ps.close();
            }

        }

        return definicaoList;
    }
}
