package ec.edu.puce;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDireccion;
	private JLabel lblMensaje;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setTitle("Botenes y eventos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 622, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(12, 12, 70, 15);
		contentPane.add(lblNombre);

		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(12, 39, 70, 15);
		contentPane.add(lblApellido);

		JLabel lblDireccion = new JLabel("Dirección");
		lblDireccion.setBounds(12, 77, 70, 15);
		contentPane.add(lblDireccion);

		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNombre.setText(null);
				txtApellido.setText(null);
				txtDireccion.setText(null);
				lblMensaje.setText(null);
			}
		});
		btnNuevo.setBounds(65, 214, 117, 25);
		contentPane.add(btnNuevo);

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMensaje.setText("Hola" + " " + txtNombre.getText() + " " + txtApellido.getText());
			}
		});
		btnGuardar.setBounds(194, 214, 117, 25);
		contentPane.add(btnGuardar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(323, 214, 117, 25);
		contentPane.add(btnCancelar);

		txtNombre = new JTextField();
		txtNombre.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				txtNombre.setText(txtNombre.getText().toUpperCase());
			}

		});

		txtApellido = new JTextField();
		txtApellido.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				txtApellido.setText(txtApellido.getText().toUpperCase());
			}
		});

		txtDireccion = new JTextField();
		txtDireccion.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				txtDireccion.setText(txtDireccion.getText().toUpperCase());
			}
		});

		txtNombre.setBounds(100, 10, 114, 19);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		txtApellido.setBounds(100, 37, 114, 19);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);

		txtDireccion.setBounds(100, 75, 114, 19);
		contentPane.add(txtDireccion);
		txtDireccion.setColumns(10);

		lblMensaje = new JLabel("");
		lblMensaje.setBounds(87, 116, 403, 45);
		contentPane.add(lblMensaje);
	}
}
