/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alex.Boteco.controller;

import br.com.alex.Boteco.model.DAO.SalgadoDAO;
import br.com.alex.Boteco.model.SalgadoVO;
import java.util.List;

/**
 *
 * @author Alex
 */
public class SalgadoController {

    public boolean saveSalgado(SalgadoVO salgadoVO) {
        SalgadoDAO salgadoDAO = new SalgadoDAO();
        return salgadoDAO.saveSalgado(salgadoVO);
        
    }

    public List<SalgadoVO> findAll() {
        SalgadoDAO salgadoDAO = new SalgadoDAO();
        return salgadoDAO.findAll();
    }

    public boolean deleteSalgado(SalgadoVO salgadoVO) {
        SalgadoDAO salgadoDAO = new SalgadoDAO();
        return salgadoDAO.deleteSalgado(salgadoVO);
    }

    public SalgadoVO findById(SalgadoVO salgadoVO) {
        SalgadoDAO salgadoDAO = new SalgadoDAO();        
        return salgadoDAO.findById(salgadoVO);
    }

    public List<SalgadoVO> findByCategoria(SalgadoVO salgadoVO) {
        SalgadoDAO salgadoDAO = new SalgadoDAO();
        return salgadoDAO.findByCategoria(salgadoVO);
        
    }

    public List<SalgadoVO> findBySabor(SalgadoVO salgadoVO) {
        SalgadoDAO salgadoDAO = new SalgadoDAO();
        return salgadoDAO.findBySabor(salgadoVO);
    }

    public List<SalgadoVO> findByCategoriaSabor(SalgadoVO salgadoVO) {
        SalgadoDAO salgadoDAO = new SalgadoDAO();
        return salgadoDAO.findByCategoriaSabor(salgadoVO);
    }

    public SalgadoVO findByCategoriaSaborCliente(SalgadoVO salgadoVO) {
        SalgadoDAO salgadoDAO = new SalgadoDAO();
        return salgadoDAO.findByCategoriaSaborCliente(salgadoVO);        
    }

   
    
}
