/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Mateus
 */
public class Utilitarios {
    
    public static ImageIcon imagemInternet (String urlInternet) 
    {
        ImageIcon imagemIcon;
        try 
        {
            URL url  = new URL(urlInternet);
            imagemIcon = new ImageIcon(url);
            return imagemIcon;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
    public static void criarPainelProduto (String caminhoFoto, JLabel foto, String textoProduto ,JLabel texto)
    {
        Image imagem = imagemInternet(caminhoFoto).getImage().getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_SMOOTH);
        foto.setIcon(new ImageIcon(imagem));
        texto.setText(textoProduto);
    }
}
