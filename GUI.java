
import javax.swing.*;
import java.awt.*;
class MyFrame
	extends JFrame {

	// Components of the Form
	private Container c;
	public MyFrame()
	{
		setTitle("Registration Form");
		setBounds(300, 90, 900, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		c = getContentPane();
		c.setLayout(null);

		JLabel stud_info = new JLabel("Student Information");
		stud_info.setFont(new Font("Arial", Font.PLAIN, 30));
		stud_info.setSize(300, 30);
		stud_info.setLocation(300, 30);
		c.add(stud_info);

		JLabel stud_id = new JLabel("Student Id");
		stud_id.setFont(new Font("Arial", Font.PLAIN, 20));
		stud_id.setSize(100, 20);
		stud_id.setLocation(100, 100);
		c.add(stud_id);

		JTextField stud_idf= new JTextField();
		stud_idf.setFont(new Font("Arial", Font.PLAIN, 15));
		stud_idf.setSize(190, 20);
		stud_idf.setLocation(200, 100);
		c.add(stud_idf);

		JLabel fname = new JLabel("First Name");
		fname.setFont(new Font("Arial", Font.PLAIN, 20));
		fname.setSize(100, 20);
		fname.setLocation(100, 150);
		c.add(fname);

		JTextField fname_field = new JTextField();
		fname_field.setFont(new Font("Arial", Font.PLAIN, 15));
		fname_field.setSize(190, 20);
		fname_field.setLocation(200, 150);
		c.add(fname_field);

		JLabel l_name = new JLabel("Last Name");
		l_name.setFont(new Font("Arial", Font.PLAIN, 20));
		l_name.setSize(100, 20);
		l_name.setLocation(100, 200);
		c.add(l_name);

		
		JTextField last_name = new JTextField();
        last_name.setFont(new Font("Arial", Font.PLAIN, 15));
		last_name.setSize(190, 20);
		last_name.setLocation(200, 200);
        c.add(last_name);

		JLabel course = new JLabel("Course");
		course.setFont(new Font("Arial", Font.PLAIN, 20));
		course.setSize(100, 20);
		course.setLocation(100, 250);
		c.add(course);

		JTextField course_name = new JTextField();
        course_name.setFont(new Font("Arial", Font.PLAIN, 15));
		course_name.setSize(190, 20);
		course_name.setLocation(200, 250);
        c.add(course_name);


		JLabel y_level = new JLabel("Year Level");
		y_level.setFont(new Font("Arial", Font.PLAIN, 20));
		y_level.setSize(100, 20);
		y_level.setLocation(100, 300);
		c.add(y_level);

		JTextField year_level = new JTextField();
        year_level .setFont(new Font("Arial", Font.PLAIN, 15));
        year_level .setSize(190, 20);
        year_level .setLocation(200, 300);
        c.add(year_level);



		JButton add = new JButton("Add");
		add.setFont(new Font("Arial", Font.PLAIN, 15));
		add.setSize(100, 20);
		add.setLocation(150, 350);
		c.add(add);

		JButton edit = new JButton("Edit");
		edit.setFont(new Font("Arial", Font.PLAIN, 15));
		edit.setSize(100, 20);
		edit.setLocation(270, 350);
        c.add(edit);

        JButton search = new JButton("Search");
        search.setFont(new Font("Arial", Font.PLAIN, 15));
        search.setSize(100, 20);
        search.setLocation(390, 350);
        c.add(search);

        JButton delete = new JButton("Delete");
        delete.setFont(new Font("Arial", Font.PLAIN, 15));
        delete.setSize(100, 20);
        delete.setLocation(510, 350);
        c.add(delete);

		

		setVisible(true);
	}	
}
class GUI {
	public static void main(String[] args) throws Exception
	{
		MyFrame f = new MyFrame();
	}
}
