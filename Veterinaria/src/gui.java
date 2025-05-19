package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import arreglos.Arreglo_mascotas;
import hijos.Gatos;
import hijos.Perros;
import padre.Mascota;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Gui extends JFrame {
	Arreglo_mascotas am=new Arreglo_mascotas();
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnompac;
	private JTextField txtsexo;
	private JTextField txtedad;
	private JTextField txtpeso;
	private JTextField txtcolor;
	private JTextField txtnomdueño;
	private JTextField txtcorreo;
	private JTextField txtdireccion;
	private JTextField txtcelular;
	private JTextField txtespecieca;
	private JTextField txtespeciefe;
	private JTextArea txtS;
	private JComboBox cboespecie;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui frame = new Gui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public Gui() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 726, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre paciente");
		lblNewLabel_1.setBounds(21, 11, 92, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("sexo");
		lblNewLabel_2.setBounds(21, 36, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("edad");
		lblNewLabel_3.setBounds(21, 61, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("peso");
		lblNewLabel_4.setBounds(21, 86, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("color");
		lblNewLabel_5.setBounds(21, 111, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Nombre dueño");
		lblNewLabel_6.setBounds(332, 11, 92, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("correo");
		lblNewLabel_7.setBounds(332, 36, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("direccion");
		lblNewLabel_8.setBounds(332, 61, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("celular");
		lblNewLabel_9.setBounds(332, 86, 46, 14);
		contentPane.add(lblNewLabel_9);
		
		txtnompac = new JTextField();
		txtnompac.setBounds(120, 8, 186, 20);
		contentPane.add(txtnompac);
		txtnompac.setColumns(10);
		
		txtsexo = new JTextField();
		txtsexo.setBounds(120, 33, 186, 20);
		contentPane.add(txtsexo);
		txtsexo.setColumns(10);
		
		txtedad = new JTextField();
		txtedad.setColumns(10);
		txtedad.setBounds(120, 58, 186, 20);
		contentPane.add(txtedad);
		
		txtpeso = new JTextField();
		txtpeso.setColumns(10);
		txtpeso.setBounds(121, 83, 185, 20);
		contentPane.add(txtpeso);
		
		txtcolor = new JTextField();
		txtcolor.setColumns(10);
		txtcolor.setBounds(121, 108, 185, 20);
		contentPane.add(txtcolor);
		
		txtnomdueño = new JTextField();
		txtnomdueño.setColumns(10);
		txtnomdueño.setBounds(415, 8, 154, 20);
		contentPane.add(txtnomdueño);
		
		txtcorreo = new JTextField();
		txtcorreo.setColumns(10);
		txtcorreo.setBounds(415, 33, 154, 20);
		contentPane.add(txtcorreo);
		
		txtdireccion = new JTextField();
		txtdireccion.setColumns(10);
		txtdireccion.setBounds(415, 58, 154, 20);
		contentPane.add(txtdireccion);
		
		txtcelular = new JTextField();
		txtcelular.setColumns(10);
		txtcelular.setBounds(415, 83, 154, 20);
		contentPane.add(txtcelular);
		
		JLabel lblNewLabel_12 = new JLabel("informe");
		lblNewLabel_12.setBounds(340, 151, 46, 14);
		contentPane.add(lblNewLabel_12);
		
		{JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(327, 178, 373, 302);
		contentPane.add(scrollPane);
		{
			 txtS = new JTextArea();
			scrollPane.setViewportView(txtS);
		}
		}
		
		
		 cboespecie = new JComboBox();
		cboespecie.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				int posi=cboespecie.getSelectedIndex();
				switch (posi) {
				case 0://perro
					txtespecieca.setEditable(true);
					txtespeciefe.setEditable(false);			
					break;	
					default://gato
				    txtespecieca.setEditable(false);
				    txtespeciefe.setEditable(true);		
				    break;
			}
			}});
		cboespecie.setModel(new DefaultComboBoxModel(new String[] {"Perro", "Gato"}));
		cboespecie.setBounds(120, 139, 186, 22);
		contentPane.add(cboespecie);
		//txtespecieca.setEditable(false);
		//txtespeciefe.setEditable(false);
		
		
		
		
		JButton btnNewButton = new JButton("Registrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
        try{
				int posi=cboespecie.getSelectedIndex();
				String nom_paciente=txtnompac.getText();
				String sexo=txtsexo.getText();
				String color=txtcolor.getText();			
				String nom_due=txtnomdueño.getText();
				String correo=txtcorreo.getText();
				String direccion=txtdireccion.getText();
				double peso=Double.parseDouble(txtpeso.getText());
				int edad=Integer.parseInt(txtedad.getText());
				int celular=Integer.parseInt(txtcelular.getText());
				Mascota pet=null;
				switch(posi) {
				case 0://perro
					
					String especiepe=txtespecieca.getText();
					pet=new Perros(nom_paciente, sexo, color, nom_due, correo, direccion, edad, celular, peso, especiepe);
				    informe(pet);
				    Perros  e1=new Perros(Leernompac(),Leerespecie(),Leersexo(),Leercolor(),Leernomdueño(),Leercorreo(),Leerdireccion(),Leeredad(),Leercelular()
							,Leerpeso(),Leerrazacanina());
				
					am.Adicionar(e1);
			    break;
				default://gato
					String especiega=txtespeciefe.getText();
					pet=new Gatos(nom_paciente, especie, sexo, color, nom_due, correo, direccion, edad, celular, peso, especiega);
					informe(pet);
					Gatos  e2=new Gatos(Leernompac(),Leerespecie(),Leersexo(),Leercolor(),Leernomdueño(),Leercorreo(),Leerdireccion(),Leeredad(),Leercelular()
							,Leerpeso(),Leerrazafelina());	
					am.Adicionar(e2);
					break;
        }
        }catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error en el formato numérico: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Se ha producido un error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

		});
		
		btnNewButton.setBounds(402, 125, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_13 = new JLabel("especie");
		lblNewLabel_13.setBounds(21, 145, 46, 11);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("raza canina");
		lblNewLabel_14.setBounds(21, 171, 82, 14);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("raza felina");
		lblNewLabel_15.setBounds(21, 194, 68, 14);
		contentPane.add(lblNewLabel_15);
		
		txtespecieca = new JTextField();
		txtespecieca.setBounds(120, 168, 186, 20);
		contentPane.add(txtespecieca);
		txtespecieca.setColumns(10);
		
		txtespeciefe = new JTextField();
		txtespeciefe.setEditable(false);
		txtespeciefe.setBounds(120, 191, 186, 20);
		contentPane.add(txtespeciefe);
		txtespeciefe.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("editar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*Mascota es=m.Buscar(leer());
				if(es!=null) {
					es.setNom(LeerNombre());
					es.setN1(LeerN1());
					es.setN2(LeerN2());
					es.setN2(LeerN3());*/
			}
		});
		btnNewButton_1.setBounds(529, 125, 89, 23);
		contentPane.add(btnNewButton_1);
	
	}
	
	void Imprimir (String s) {
		txtS.append(s+"\n");
	}
	void Imprimir() {
		txtS.append("***********");
	}
	void informe(Mascota m) {
		Imprimir(m.Informe());
	}
	public String Leernompac() {
		return (txtnompac.getText());
	}
	public String Leerespecie() {
		int posi=cboespecie.getSelectedIndex();
		if(posi==0)return "perro";
		else return "gato";
	}
	public String Leersexo() {
		return (txtsexo.getText());
	}
	public String Leerrazacanina() {
		return (txtespecieca.getText());
	}
	public String Leerrazafelina() {
		return (txtespeciefe.getText());
	}
	public String Leernomdueño() {
		return (txtnomdueño.getText());
	}
	public String Leercorreo() {
		return (txtcorreo.getText());
	}
	public String Leerdireccion() {
		return (txtdireccion.getText());
	}
	
	public int Leeredad() {
		return Integer.parseInt(txtedad.getText());
	}
	public int Leercelular() {
		return Integer.parseInt(txtcelular.getText());
	}
	public String Leercolor() {
		return txtcolor.getText();
		
	}
	public double Leerpeso() {
		return Double.parseDouble(txtedad.getText());
	}
}
