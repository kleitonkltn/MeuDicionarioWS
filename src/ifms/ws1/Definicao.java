/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifms.ws1;

import com.towel.el.annotation.Resolvable;

/**
 *
 * @author NVIDIA
 */
public class Definicao {

    @Resolvable(colName = "ID")
    private long id;
    @Resolvable(colName = "Palavra")
    private String palavra;
    @Resolvable(colName = "Definicao")
    private String definicao;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPalavra() {

        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public String getDefinicao() {
        return definicao;
    }

    public void setDefinicao(String definicao) {
        this.definicao = definicao;
    }

}
