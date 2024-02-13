package eu.jpereira.trainings.designpatterns.creational.factorymethod;



public class XMLReportGenerator extends ReportGenerator{

    @Override
    public void createReport (ReportData data) {
        Report report = new XMLReport();
        report.generateReport(data);
        setReport(report);
    }
}
