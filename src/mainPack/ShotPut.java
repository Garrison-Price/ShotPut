package mainPack;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PriceG
 */
public class ShotPut extends JFrame
{
    DrawingPanel draw;
    JPanel vars;
    JSlider armSlide;
    JLabel armLab;
    JLabel massLab;
    JSlider massSlide;
    JLabel angleLab;
    JSlider angleSlide;
    JButton putButton;
    JPanel out;
    JLabel distOut;
    JLabel fOut;

    public ShotPut()
    {
        super("Shot Put");
        initComps();
    }

    private void initComps()
    {

        draw = new DrawingPanel();
        vars = new javax.swing.JPanel();
        armSlide = new javax.swing.JSlider();
        armLab = new javax.swing.JLabel();
        massLab = new javax.swing.JLabel();
        massSlide = new javax.swing.JSlider();
        angleLab = new javax.swing.JLabel();
        angleSlide = new javax.swing.JSlider();
        putButton = new javax.swing.JButton();
        out = new javax.swing.JPanel();
        distOut = new javax.swing.JLabel();
        fOut = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        draw.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(draw);
        draw.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 405, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 315, Short.MAX_VALUE)
        );

        vars.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        armSlide.setMaximum(200);
        armSlide.setValue(90);

        armLab.setText("Arm Length(cm) : 90");

        massLab.setText("Shot Mass(kg) : 5");

        massSlide.setMaximum(15);
        massSlide.setValue(5);

        angleLab.setText("Angle(DEG) : 45");

        angleSlide.setMajorTickSpacing(1);
        angleSlide.setMaximum(90);
        angleSlide.setSnapToTicks(true);
        angleSlide.setValue(45);

        angleSlide.addChangeListener(new ChangeListener()
        {
            public void stateChanged(ChangeEvent e)
            {
                angleLab.setText("Angle(DEG) : "+ angleSlide.getValue());
            }
        });
        massSlide.addChangeListener(new ChangeListener()
        {
            public void stateChanged(ChangeEvent e)
            {
                massLab.setText("Shot Mass(kg) "+ massSlide.getValue());
            }
        });
        armSlide.addChangeListener(new ChangeListener()
        {
            public void stateChanged(ChangeEvent e)
            {
                armLab.setText("Arm Length(cm) : "+ armSlide.getValue());
            }
        });

        massSlide.setMinimum(1);

        putButton.setText("Launch");

        putButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                launch();
            }

        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(vars);
        vars.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(armLab)
                            .addComponent(massSlide, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(armSlide, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(massLab)
                            .addComponent(angleLab)
                            .addComponent(angleSlide, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(putButton)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(armLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(armSlide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(massLab)
                .addGap(7, 7, 7)
                .addComponent(massSlide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(angleLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(angleSlide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(putButton)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        out.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        distOut.setText("Distance: ");

        fOut.setText("Force:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(out);
        out.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(distOut)
                    .addComponent(fOut))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(distOut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fOut)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(draw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(out, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vars, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(draw, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(vars, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(out, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }

    public void launch()
    {
        distOut.setText("Distance: "+getDistance());

        fOut.setText("Force: "+getForce());
        draw.draww(armSlide.getValue(),massSlide.getValue(),angleSlide.getValue(), (int)getDistance());
    }

    public double getDistance()
    {
        double theta = ((angleSlide.getValue()*Math.PI)/180);
        double con = ((1.445*armSlide.getValue()/100)/(4.9*massSlide.getValue()));
        double f = (((-8)/9)*(theta))*(Math.cos(theta)*(Math.sin(theta)));
        double l = (285*(Math.cos(theta))*(Math.sin(theta)));

        return (double)Math.round(con*(f+l)*1000)/1000;
    }

    public double getForce()
    {
        double theta = angleSlide.getValue();
        return (double)Math.round((((-8*(theta))/9)+285)*1000)/1000;
    }

    public static void main(String args[])
    {
        ShotPut app = new ShotPut();
        app.setVisible(true);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
