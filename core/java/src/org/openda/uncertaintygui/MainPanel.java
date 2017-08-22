/* OpenDA v2.4.1 
* Copyright (c) 2017 OpenDA Association 
* All rights reserved.
* 
* This file is part of OpenDA. 
* 
* OpenDA is free software: you can redistribute it and/or modify 
* it under the terms of the GNU Lesser General Public License as 
* published by the Free Software Foundation, either version 3 of 
* the License, or (at your option) any later version. 
* 
* OpenDA is distributed in the hope that it will be useful, 
* but WITHOUT ANY WARRANTY; without even the implied warranty of 
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the 
* GNU Lesser General Public License for more details. 
* 
* You should have received a copy of the GNU Lesser General Public License
* along with OpenDA.  If not, see <http://www.gnu.org/licenses/>.
*/

package org.openda.uncertaintygui;


/**
 * Main GUI panel for DATools including all tabs.
 */
public class MainPanel extends javax.swing.JPanel {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton addRowPdfDefinitionButton;
    protected javax.swing.JButton addRowResultsButton;
    protected javax.swing.JButton addRowVariationPerParameterButton;
    protected javax.swing.JPanel applicationPanel;
    private javax.swing.JComboBox applicationTypeComboBox;
    private javax.swing.JLabel applicationTypeLabel;
    private javax.swing.JPanel autoCorrelationPanel;
    private org.openda.uncertaintygui.ParameterAndGraphPanel autoCorrelationParameterAndGraphPanel;
    protected javax.swing.JScrollPane autoCorrelationScrollPane;
    protected javax.swing.JTable autoCorrelationTable;
    private javax.swing.JComboBox calibrationMethodComboBox;
    private javax.swing.JLabel calibrationMethodLabel;
    private javax.swing.JComboBox dataAssimilationMethodComboBox;
    private javax.swing.JLabel dataAssimilationMethodLabel;
    protected javax.swing.JButton deleteRowPdfDefinitionButton;
    protected javax.swing.JButton deleteRowResultsButton;
    protected javax.swing.JButton deleteRowVariationPerParameterButton;
    protected javax.swing.JButton loadUncertaintySpecificationFileButton;
    protected javax.swing.JTabbedPane mainTabbedPane;
    private javax.swing.JPanel methodSettingsPanel;
    private javax.swing.JPanel modelSchematizationPanel;
    protected javax.swing.JFormattedTextField monteCarloEndFormattedTextField;
    private javax.swing.JPanel monteCarloPropertiesPanel;
    private javax.swing.JLabel monteCarloSimulationsEndLabel;
    private javax.swing.JLabel monteCarloSimulationsStartLabel;
    protected javax.swing.JFormattedTextField monteCarloStartFormattedTextField;
    protected javax.swing.JPanel pdfDefinitionPanel;
    protected javax.swing.JScrollPane pdfDefinitionScrollPane;
    protected javax.swing.JTable pdfDefinitionTable;
    private javax.swing.JToolBar pdfDefinitionToolBar;
    private org.openda.uncertaintygui.ParameterAndGraphPanel pdfParameterAndGraphPanel;
    private javax.swing.JPanel resultsPanel;
    protected javax.swing.JTable resultsTable;
    protected javax.swing.JScrollPane resultsTableScrollPane;
    protected javax.swing.JToolBar resultsToolBar;
    private javax.swing.JLabel uncertainItemsFileLabel;
    protected javax.swing.JTextField uncertainItemsFileTextField;
    private javax.swing.JComboBox uncertaintyAnalysisMethodComboBox;
    private javax.swing.JLabel uncertaintyAnalysisMethodLabel;
    private javax.swing.JPanel uncertaintyApplicationPanel;
    private javax.swing.JLabel uncertaintySpecificationFileLabel;
    protected javax.swing.JTextField uncertaintySpecificationFileTextField;
    private javax.swing.JPanel variationPerParameterPanel;
    protected javax.swing.JScrollPane variationPerParameterScrollPane;
    private org.openda.uncertaintygui.ParameterAndGraphPanel variationPerParameterSidePanel;
    protected javax.swing.JTable variationPerParameterTable;
    private javax.swing.JToolBar variationPerParameterToolBar;
    // End of variables declaration//GEN-END:variables

    /**
     * Creates new form DaMainPanel
     */
    public MainPanel() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        pdfDefinitionPanel = new javax.swing.JPanel();
        pdfDefinitionToolBar = new javax.swing.JToolBar();
        addRowPdfDefinitionButton = new javax.swing.JButton();
        deleteRowPdfDefinitionButton = new javax.swing.JButton();
        pdfDefinitionScrollPane = new javax.swing.JScrollPane();
        pdfDefinitionTable = new javax.swing.JTable();
        pdfParameterAndGraphPanel = new org.openda.uncertaintygui.ParameterAndGraphPanel();
        autoCorrelationPanel = new javax.swing.JPanel();
        autoCorrelationScrollPane = new javax.swing.JScrollPane();
        autoCorrelationTable = new javax.swing.JTable();
        autoCorrelationParameterAndGraphPanel = new org.openda.uncertaintygui.ParameterAndGraphPanel();
        variationPerParameterPanel = new javax.swing.JPanel();
        variationPerParameterToolBar = new javax.swing.JToolBar();
        addRowVariationPerParameterButton = new javax.swing.JButton();
        deleteRowVariationPerParameterButton = new javax.swing.JButton();
        variationPerParameterScrollPane = new javax.swing.JScrollPane();
        variationPerParameterTable = new javax.swing.JTable();
        variationPerParameterSidePanel = new org.openda.uncertaintygui.ParameterAndGraphPanel();
        resultsPanel = new javax.swing.JPanel();
        resultsToolBar = new javax.swing.JToolBar();
        addRowResultsButton = new javax.swing.JButton();
        deleteRowResultsButton = new javax.swing.JButton();
        resultsTableScrollPane = new javax.swing.JScrollPane();
        resultsTable = new javax.swing.JTable();
        mainTabbedPane = new javax.swing.JTabbedPane();
        applicationPanel = new javax.swing.JPanel();
        modelSchematizationPanel = new javax.swing.JPanel();
        uncertainItemsFileLabel = new javax.swing.JLabel();
        uncertainItemsFileTextField = new javax.swing.JTextField();
        uncertaintyApplicationPanel = new javax.swing.JPanel();
        uncertaintySpecificationFileLabel = new javax.swing.JLabel();
        uncertaintySpecificationFileTextField = new javax.swing.JTextField();
        loadUncertaintySpecificationFileButton = new javax.swing.JButton();
        applicationTypeLabel = new javax.swing.JLabel();
        applicationTypeComboBox = new javax.swing.JComboBox();
        uncertaintyAnalysisMethodLabel = new javax.swing.JLabel();
        uncertaintyAnalysisMethodComboBox = new javax.swing.JComboBox();
        calibrationMethodLabel = new javax.swing.JLabel();
        calibrationMethodComboBox = new javax.swing.JComboBox();
        dataAssimilationMethodLabel = new javax.swing.JLabel();
        dataAssimilationMethodComboBox = new javax.swing.JComboBox();
        methodSettingsPanel = new javax.swing.JPanel();
        monteCarloPropertiesPanel = new javax.swing.JPanel();
        monteCarloSimulationsStartLabel = new javax.swing.JLabel();
        monteCarloStartFormattedTextField = new javax.swing.JFormattedTextField();
        monteCarloSimulationsEndLabel = new javax.swing.JLabel();
        monteCarloEndFormattedTextField = new javax.swing.JFormattedTextField();

        pdfDefinitionPanel.setMaximumSize(null);
        pdfDefinitionPanel.setMinimumSize(new java.awt.Dimension(400, 400));
        pdfDefinitionPanel.setName("Uncertainty Specification (PDF)");
        pdfDefinitionToolBar.setFloatable(false);
        addRowPdfDefinitionButton.setText("Add Row");
        pdfDefinitionToolBar.add(addRowPdfDefinitionButton);

        deleteRowPdfDefinitionButton.setText("Delete Row");
        pdfDefinitionToolBar.add(deleteRowPdfDefinitionButton);

        // TODO: make this configurable
        addRowPdfDefinitionButton.setVisible(false);
        deleteRowPdfDefinitionButton.setVisible(false);

        pdfDefinitionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        pdfDefinitionScrollPane.setViewportView(pdfDefinitionTable);

        org.jdesktop.layout.GroupLayout pdfDefinitionPanelLayout = new org.jdesktop.layout.GroupLayout(pdfDefinitionPanel);
        pdfDefinitionPanel.setLayout(pdfDefinitionPanelLayout);
        pdfDefinitionPanelLayout.setHorizontalGroup(
            pdfDefinitionPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, pdfDefinitionPanelLayout.createSequentialGroup()
                .add(pdfDefinitionScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(pdfParameterAndGraphPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 400, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pdfDefinitionToolBar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
        );
        pdfDefinitionPanelLayout.setVerticalGroup(
            pdfDefinitionPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pdfDefinitionPanelLayout.createSequentialGroup()
                .add(pdfDefinitionToolBar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(pdfDefinitionPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(pdfDefinitionScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
                    .add(pdfParameterAndGraphPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)))
        );
        autoCorrelationPanel.setName("Correlation");
        autoCorrelationScrollPane.setMaximumSize(null);
        autoCorrelationScrollPane.setMinimumSize(null);
        autoCorrelationScrollPane.setPreferredSize(null);
        autoCorrelationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        autoCorrelationScrollPane.setViewportView(autoCorrelationTable);

        autoCorrelationParameterAndGraphPanel.setMaximumSize(null);
        autoCorrelationParameterAndGraphPanel.setMinimumSize(null);
        autoCorrelationParameterAndGraphPanel.setPreferredSize(null);

        org.jdesktop.layout.GroupLayout autoCorrelationPanelLayout = new org.jdesktop.layout.GroupLayout(autoCorrelationPanel);
        autoCorrelationPanel.setLayout(autoCorrelationPanelLayout);
        autoCorrelationPanelLayout.setHorizontalGroup(
            autoCorrelationPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, autoCorrelationPanelLayout.createSequentialGroup()
                .add(autoCorrelationScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(autoCorrelationParameterAndGraphPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 400, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        autoCorrelationPanelLayout.setVerticalGroup(
            autoCorrelationPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(autoCorrelationParameterAndGraphPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 769, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, autoCorrelationScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 769, Short.MAX_VALUE)
        );
        variationPerParameterPanel.setName("Uncertainty Specification (Range)");
        variationPerParameterToolBar.setFloatable(false);
        addRowVariationPerParameterButton.setText("Add Row");
        variationPerParameterToolBar.add(addRowVariationPerParameterButton);

        deleteRowVariationPerParameterButton.setText("Delete Row");
        variationPerParameterToolBar.add(deleteRowVariationPerParameterButton);

        variationPerParameterTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        variationPerParameterScrollPane.setViewportView(variationPerParameterTable);

        org.jdesktop.layout.GroupLayout variationPerParameterPanelLayout = new org.jdesktop.layout.GroupLayout(variationPerParameterPanel);
        variationPerParameterPanel.setLayout(variationPerParameterPanelLayout);
        variationPerParameterPanelLayout.setHorizontalGroup(
            variationPerParameterPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, variationPerParameterPanelLayout.createSequentialGroup()
                .add(variationPerParameterScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(variationPerParameterSidePanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 400, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(variationPerParameterToolBar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 914, Short.MAX_VALUE)
        );
        variationPerParameterPanelLayout.setVerticalGroup(
            variationPerParameterPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(variationPerParameterPanelLayout.createSequentialGroup()
                .add(variationPerParameterToolBar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(variationPerParameterPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(variationPerParameterScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, variationPerParameterSidePanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)))
        );
        resultsPanel.setMaximumSize(null);
        resultsPanel.setMinimumSize(new java.awt.Dimension(400, 400));
        resultsPanel.setName("Results");
        resultsToolBar.setFloatable(false);
        addRowResultsButton.setText("Add Row");
        resultsToolBar.add(addRowResultsButton);

        deleteRowResultsButton.setText("Delete Row");
        resultsToolBar.add(deleteRowResultsButton);

        resultsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        resultsTableScrollPane.setViewportView(resultsTable);

        org.jdesktop.layout.GroupLayout resultsPanelLayout = new org.jdesktop.layout.GroupLayout(resultsPanel);
        resultsPanel.setLayout(resultsPanelLayout);
        resultsPanelLayout.setHorizontalGroup(
            resultsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(resultsToolBar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 571, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(resultsTableScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
        );
        resultsPanelLayout.setVerticalGroup(
            resultsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(resultsPanelLayout.createSequentialGroup()
                .add(resultsToolBar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(resultsTableScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
                .addContainerGap())
        );

        setMaximumSize(null);
        setMinimumSize(new java.awt.Dimension(400, 400));
        setPreferredSize(new java.awt.Dimension(550, 750));
        mainTabbedPane.setMaximumSize(null);
        mainTabbedPane.setMinimumSize(new java.awt.Dimension(400, 400));
        applicationPanel.setMaximumSize(null);
        applicationPanel.setMinimumSize(new java.awt.Dimension(400, 400));
        modelSchematizationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Model Schematization"));
        uncertainItemsFileLabel.setText("Uncertain Items:");

        uncertainItemsFileTextField.setEditable(false);

        org.jdesktop.layout.GroupLayout modelSchematizationPanelLayout = new org.jdesktop.layout.GroupLayout(modelSchematizationPanel);
        modelSchematizationPanel.setLayout(modelSchematizationPanelLayout);
        modelSchematizationPanelLayout.setHorizontalGroup(
            modelSchematizationPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(modelSchematizationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(modelSchematizationPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, uncertainItemsFileLabel)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, uncertainItemsFileTextField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE))
                .addContainerGap())
        );
        modelSchematizationPanelLayout.setVerticalGroup(
            modelSchematizationPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(modelSchematizationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(uncertainItemsFileLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(uncertainItemsFileTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(9, 9, 9)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        uncertaintyApplicationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Uncertainty Application"));
        uncertaintySpecificationFileLabel.setText("Uncertainty Specification File:");

        uncertaintySpecificationFileTextField.setEditable(false);

        loadUncertaintySpecificationFileButton.setText("Load");

        org.jdesktop.layout.GroupLayout uncertaintyApplicationPanelLayout = new org.jdesktop.layout.GroupLayout(uncertaintyApplicationPanel);
        uncertaintyApplicationPanel.setLayout(uncertaintyApplicationPanelLayout);
        uncertaintyApplicationPanelLayout.setHorizontalGroup(
            uncertaintyApplicationPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(uncertaintyApplicationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(uncertaintyApplicationPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(uncertaintySpecificationFileLabel)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, uncertaintyApplicationPanelLayout.createSequentialGroup()
                        .add(uncertaintyApplicationPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(uncertaintySpecificationFileTextField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(uncertaintyApplicationPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                            .add(loadUncertaintySpecificationFileButton))))
                .addContainerGap())
        );
        uncertaintyApplicationPanelLayout.setVerticalGroup(
            uncertaintyApplicationPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(uncertaintyApplicationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(uncertaintySpecificationFileLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(uncertaintyApplicationPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(uncertaintySpecificationFileTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(loadUncertaintySpecificationFileButton))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(uncertaintyApplicationPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        applicationTypeLabel.setText("Application Type:");

        applicationTypeComboBox.setMaximumSize(new java.awt.Dimension(150, 32767));
        applicationTypeComboBox.setMinimumSize(new java.awt.Dimension(150, 20));

        uncertaintyAnalysisMethodLabel.setText("Uncertainty Analysis Method:");

        uncertaintyAnalysisMethodComboBox.setMaximumSize(new java.awt.Dimension(150, 32767));
        uncertaintyAnalysisMethodComboBox.setMinimumSize(new java.awt.Dimension(150, 20));
        uncertaintyAnalysisMethodComboBox.setPreferredSize(null);

        calibrationMethodLabel.setText("Calibration Method:");

        calibrationMethodComboBox.setMaximumSize(new java.awt.Dimension(150, 32767));
        calibrationMethodComboBox.setMinimumSize(new java.awt.Dimension(150, 20));
        calibrationMethodComboBox.setPreferredSize(null);

        dataAssimilationMethodLabel.setText("Data Assimilation Method:");

        dataAssimilationMethodComboBox.setMaximumSize(new java.awt.Dimension(150, 32767));
        dataAssimilationMethodComboBox.setMinimumSize(new java.awt.Dimension(150, 20));
        dataAssimilationMethodComboBox.setPreferredSize(null);

        org.jdesktop.layout.GroupLayout applicationPanelLayout = new org.jdesktop.layout.GroupLayout(applicationPanel);
        applicationPanel.setLayout(applicationPanelLayout);
        applicationPanelLayout.setHorizontalGroup(
            applicationPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(applicationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(applicationPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(uncertaintyApplicationPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(applicationTypeLabel)
                    .add(uncertaintyAnalysisMethodLabel)
                    .add(calibrationMethodLabel)
                    .add(dataAssimilationMethodLabel)
                    .add(modelSchematizationPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(dataAssimilationMethodComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(applicationTypeComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(calibrationMethodComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(uncertaintyAnalysisMethodComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(412, Short.MAX_VALUE))
        );
        applicationPanelLayout.setVerticalGroup(
            applicationPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(applicationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(applicationTypeLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(applicationTypeComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(39, 39, 39)
                .add(uncertaintyAnalysisMethodLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(uncertaintyAnalysisMethodComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(calibrationMethodLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(calibrationMethodComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(dataAssimilationMethodLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(dataAssimilationMethodComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(50, 50, 50)
                .add(uncertaintyApplicationPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(modelSchematizationPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(210, Short.MAX_VALUE))
        );
        mainTabbedPane.addTab("Application", applicationPanel);

        monteCarloPropertiesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Monte Carlo"));
        monteCarloPropertiesPanel.setMaximumSize(new java.awt.Dimension(100, 30000));
        monteCarloPropertiesPanel.setMinimumSize(new java.awt.Dimension(100, 200));
        monteCarloSimulationsStartLabel.setText("Monte Carlo Simulations Start:");

        monteCarloSimulationsEndLabel.setText("Monte Carlo Simulations End:");

        org.jdesktop.layout.GroupLayout monteCarloPropertiesPanelLayout = new org.jdesktop.layout.GroupLayout(monteCarloPropertiesPanel);
        monteCarloPropertiesPanel.setLayout(monteCarloPropertiesPanelLayout);
        monteCarloPropertiesPanelLayout.setHorizontalGroup(
            monteCarloPropertiesPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(monteCarloPropertiesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(monteCarloPropertiesPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(monteCarloStartFormattedTextField)
                    .add(monteCarloSimulationsStartLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(49, 49, 49)
                .add(monteCarloPropertiesPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(monteCarloEndFormattedTextField)
                    .add(monteCarloSimulationsEndLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(490, Short.MAX_VALUE))
        );
        monteCarloPropertiesPanelLayout.setVerticalGroup(
            monteCarloPropertiesPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, monteCarloPropertiesPanelLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(monteCarloPropertiesPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(monteCarloPropertiesPanelLayout.createSequentialGroup()
                        .add(monteCarloSimulationsEndLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(monteCarloEndFormattedTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(monteCarloPropertiesPanelLayout.createSequentialGroup()
                        .add(monteCarloSimulationsStartLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(monteCarloStartFormattedTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout methodSettingsPanelLayout = new org.jdesktop.layout.GroupLayout(methodSettingsPanel);
        methodSettingsPanel.setLayout(methodSettingsPanelLayout);
        methodSettingsPanelLayout.setHorizontalGroup(
            methodSettingsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(methodSettingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(monteCarloPropertiesPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(18, 18, 18))
        );
        methodSettingsPanelLayout.setVerticalGroup(
            methodSettingsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(methodSettingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(monteCarloPropertiesPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 88, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(670, Short.MAX_VALUE))
        );
        mainTabbedPane.addTab("Method Settings", methodSettingsPanel);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainTabbedPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainTabbedPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

	public javax.swing.JButton getAddRowPdfDefinitionButton() {
		return addRowPdfDefinitionButton;
	}

	public javax.swing.JButton getDeleteRowPdfDefinitionButton() {
		return deleteRowPdfDefinitionButton;
	}

	public javax.swing.JButton getAddRowResultsButton() {
		return addRowResultsButton;
	}

    public javax.swing.JButton getDeleteRowResultsButton() {
		return deleteRowResultsButton;
	}

	public javax.swing.JTabbedPane getMainTabbedPane() {
		return mainTabbedPane;
	}

	public javax.swing.JPanel getApplicationPanel() {
		return applicationPanel;
	}

	public javax.swing.JFormattedTextField getMonteCarloEndFormattedTextField() {
		return monteCarloEndFormattedTextField;
	}

	public javax.swing.JFormattedTextField getMonteCarloStartFormattedTextField() {
		return monteCarloStartFormattedTextField;
	}

	public javax.swing.JTable getPDFDefinitionTable() {
		return pdfDefinitionTable;
	}

	public javax.swing.JPanel getResultsPanel() {
		return resultsPanel;
	}

	public javax.swing.JTable getResultsTable() {
		return resultsTable;
	}

	public javax.swing.JTextField getUncertainItemsFileTextField() {
		return uncertainItemsFileTextField;
	}

	public javax.swing.JButton getLoadUncertaintySpecificationFileButton() {
		return loadUncertaintySpecificationFileButton;
	}

	public javax.swing.JTextField getUncertaintySpecificationFileTextField() {
		return uncertaintySpecificationFileTextField;
	}

	public javax.swing.JTable getAutoCorrelationTable() {
		return autoCorrelationTable;
	}

	public org.openda.uncertaintygui.ParameterAndGraphPanel getPdfParameterAndGraphPanel() {
		return pdfParameterAndGraphPanel;
	}

	public org.openda.uncertaintygui.ParameterAndGraphPanel getAutoCorrelationParameterAndGraphPanel() {
		return autoCorrelationParameterAndGraphPanel;
	}

	public org.openda.uncertaintygui.ParameterAndGraphPanel getvariationPerParameterSidePanel() {
		return variationPerParameterSidePanel;
	}

	public javax.swing.JTable getVariationPerParameterTable() {
		return variationPerParameterTable;
	}

	public javax.swing.JPanel getPdfDefinitionPanel() {
		return pdfDefinitionPanel;
	}

	public javax.swing.JComboBox getUncertaintyAnalysisMethodComboBox() {
		return uncertaintyAnalysisMethodComboBox;
	}

	public javax.swing.JPanel getMonteCarloPropertiesPanel() {
		return monteCarloPropertiesPanel;
	}

	public javax.swing.JLabel getUncertaintyAnalysisMethodLabel() {
		return uncertaintyAnalysisMethodLabel;
	}

	public javax.swing.JComboBox getCalibrationMethodComboBox() {
		return calibrationMethodComboBox;
	}

	public javax.swing.JLabel getCalibrationMethodLabel() {
		return calibrationMethodLabel;
	}

	public javax.swing.JButton getAddRowVariationPerParameterButton() {
		return addRowVariationPerParameterButton;
	}

	public javax.swing.JButton getDeleteRowVariationPerParameterButton() {
		return deleteRowVariationPerParameterButton;
	}

	public javax.swing.JPanel getAutoCorrelationPanel() {
		return autoCorrelationPanel;
	}

	public javax.swing.JPanel getVariationPerParameterPanel() {
		return variationPerParameterPanel;
	}

	public javax.swing.JComboBox getDataAssimilationMethodComboBox() {
		return dataAssimilationMethodComboBox;
	}

	public javax.swing.JLabel getDataAssimilationMethodLabel() {
		return dataAssimilationMethodLabel;
	}

	public javax.swing.JComboBox getApplicationTypeComboBox() {
		return applicationTypeComboBox;
	}
}
