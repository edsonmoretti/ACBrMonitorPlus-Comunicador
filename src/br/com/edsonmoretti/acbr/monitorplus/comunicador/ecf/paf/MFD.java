/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.edsonmoretti.acbr.monitorplus.comunicador.ecf.paf;

import br.com.edsonmoretti.acbr.monitorplus.comunicador.ACBr;
import br.com.edsonmoretti.acbr.monitorplus.comunicador.ACBrECF;
import br.com.edsonmoretti.acbr.monitorplus.comunicador.exceptions.ACBrECFException;
import java.util.Date;

/**
 *
 * @author Edson
 */
public class MFD {

    private Espelho espelho;
    private Cotepe1704 cotepe1704;

    public class Espelho {

        /**
         * Gera arquivo do espelho da Memória de Fita Detalhe por período de
         * Data e assina digitalmente, inserindo ao final do arquivo uma linha
         * com o registro tipo EAD( Assinatura Digital ).
         *
         *
         * @param dataIni - Data Inicial. (dd/mm/aaaa)
         * @param dataFim - Data final. (dd/mm/aaaa)
         * @param caminho Local onde será gerado o arquivo
         * @throws ACBrECFException
         */
        public void porPeriodo(Date dataIni, Date dataFim, String caminho) throws ACBrECFException {
            ACBrECF.comandoECF("PafMF_MFD_Espelho(" + ACBr.formatDataBR(dataIni) + ", " + ACBr.formatDataBR(dataFim) + "," + caminho + ")");
        }

        /**
         * Gera arquivo do espelho da Memória de Fita Detalhe por intervalo de
         * COO e assina digitalmente, inserindo ao final do arquivo uma linha
         * com o registro tipo EAD( Assinatura Digital ).
         *
         * @param cooIni - Redução Z inicial.
         * @param cooFim - Redução Z final.
         * @param caminho Local onde será gerado o arquivo
         * @throws ACBrECFException
         */
        public void porCRZ(int cooIni, int cooFim, String caminho) throws ACBrECFException {
            ACBrECF.comandoECF("PafMF_MFD_Espelho(" + cooIni + ", " + cooFim + "," + caminho + ")");
        }
    }

    public class Cotepe1704 {

        /**
         * Gera o arquivo da Memória de Fita Detalhe no formato estabelecido no
         * Ato COTEPE/ICMS 17/04 por período de Data e assina digitalmente,
         * inserindo ao final do arquivo uma linha com o registro tipo EAD(
         * Assinatura Digital ).
         *
         *
         * @param dataIni - Data Inicial. (dd/mm/aaaa)
         * @param dataFim - Data final. (dd/mm/aaaa)
         * @param caminho Local onde será gerado o arquivo
         * @throws ACBrECFException
         */
        public void porPeriodo(Date dataIni, Date dataFim, String caminho) throws ACBrECFException {
            ACBrECF.comandoECF("PafMF_MFD_Cotepe1704(" + ACBr.formatDataBR(dataIni) + ", " + ACBr.formatDataBR(dataFim) + "," + caminho + ")");
        }

        /**
         * Gera o arquivo da Memória de Fita Detalhe no formato estabelecido no
         * Ato COTEPE/ICMS 17/04 por intervalo de COO e assina digitalmente,
         * inserindo ao final do arquivo uma linha com o registro tipo EAD(
         * Assinatura Digital
         *
         * @param cooIni - Redução Z inicial.
         * @param cooFim - Redução Z final.
         * @param caminho Local onde será gerado o arquivo
         * @throws ACBrECFException
         */
        public void porCRZ(int cooIni, int cooFim, String caminho) throws ACBrECFException {
            ACBrECF.comandoECF("PafMF_MFD_Cotepe1704(" + cooIni + ", " + cooFim + "," + caminho + ")");
        }
    }
}