import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener {
    private JButton boton1, boton2, boton3, boton4;
    public Formulario() {
        setLayout(null);
        boton1=new JButton("Finalizar");
        boton1.setBounds(300,250,100,30);
        add(boton1);
        boton1.addActionListener(this);
        boton2=new JButton("2");
        boton2.setBounds(10,100,90,30);
        add(boton2);
        boton2.addActionListener(this);
        boton3=new JButton("3");
        boton3.setBounds(110,100,90,30);
        add(boton3);
        boton3.addActionListener(this);
        boton4=new JButton("4");
        boton4.setBounds(210,100,90,30);
        add(boton4);
        boton4.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
            System.exit(0);
        }
        if (e.getSource()==boton2) {
            setTitle("Boton 2");
        }
        if (e.getSource()==boton3) {
            setTitle("Boton 3");
        }
        if (e.getSource()==boton4) {
            setTitle("Boton 4");
        }    
    }
    
    public static void main(String[] ar) {
        Formulario formulario1=new Formulario();
        formulario1.setBounds(0,0,450,350);
        formulario1.setVisible(true);
    }
}