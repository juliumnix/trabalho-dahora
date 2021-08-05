package Codigo;

//JAVA
import java.awt.Image;
import java.net.URL;

//SWING
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Utilitarios {
    
    public final static ImageIcon imagemInternet (String urlInternet) 
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
    
    public final static void criarPainelProduto (String caminhoFoto, JLabel foto, String textoProduto ,JLabel texto)
    {
        try {
        Image imagem = imagemInternet(caminhoFoto).getImage().getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_SMOOTH);
        foto.setIcon(new ImageIcon(imagem));
        texto.setText(textoProduto);
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } 
    }
    
    public final static void desaparecerTexto (String texto, JTextField tf)
    {
        if (tf.getText().equals(texto))
        {
            tf.setText("");
        }
    }
    
    public final static void desaparecerTexto (String texto, JPasswordField pf)
    {
        if (pf.getText().equals(texto))
        {
            pf.setText("");
        }
    }
    
    public final static void aparecerTexto (String texto, JTextField tf)
    {
        if (tf.getText().equals(""))
        {
            tf.setText(texto);
        }
    }
    
    public final static void aparecerTexto (String texto, JPasswordField pf)
    {
        if (pf.getText().equals(""))
        {
            pf.setText(texto);
        }
    }
    
    public final static void visibilidadeSenha (JCheckBox ck, JPasswordField pf)
    {
        if (ck.isSelected())
        {
            pf.setEchoChar((char)0);
        }else
        {
           pf.setEchoChar('*');
        }
    }
    
    public final static void aparecerImagemLocal (JLabel label, String caminho)
    {
        ImageIcon icone = new ImageIcon(caminho);
        Image image = icone.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(image));
    }
    
    public final static void aparecerImagemLocal (JButton button, String caminho)
    {
        ImageIcon icone = new ImageIcon(caminho);
        Image image = icone.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        button.setIcon(new ImageIcon(image));
    }
    
    public final static void centralizarTela (JFrame frame)
    {
        frame.pack();
        frame.setLocationRelativeTo(null);
    }}
