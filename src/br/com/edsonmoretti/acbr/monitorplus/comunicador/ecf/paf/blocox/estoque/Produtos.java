/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.edsonmoretti.acbr.monitorplus.comunicador.ecf.paf.blocox.estoque;

/**
 *
 * @author Edson
 */
public class Produtos extends java.util.ArrayList<ProdutoEstoque> {

    @Override
    public String toString() {
        String s = "";
        for (br.com.edsonmoretti.acbr.monitorplus.comunicador.ecf.paf.blocox.estoque.ProdutoEstoque thi : this) {
            s += thi + "\n";
        }
        return s.substring(0, s.trim().isEmpty() ? 0 : s.length() - 1);
    }
}
