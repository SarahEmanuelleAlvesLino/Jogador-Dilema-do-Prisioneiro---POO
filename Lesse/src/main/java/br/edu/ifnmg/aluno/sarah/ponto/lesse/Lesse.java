/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.ifnmg.aluno.sarah.ponto.lesse;

import io.github.guisso.meleeinterface.Decision;
import io.github.guisso.meleeinterface.IPlayer;

/**
 *
 * @author Dell
 */
public class Lesse 
    implements IPlayer{

    @Override
    public String getDeveloperName() {
        return "Sarah";
    }

    @Override
    public String getEngineName() {
        return "Lesse";
    }

    @Override
    public Decision makeMyMove(Decision opponentPreviousMove) {
        return Decision.DEFECT;
    }

}
