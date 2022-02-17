package utils;

public class Movie{
    private final String date;
    private double income;
    private final double productionCost;
    private double productionIndex;
    private  final String title;

    public Movie(String title, String date, double income, double productionCost){
        this.title = title;
        this.date = date;
        this.income = income;
        this.productionCost = productionCost;
    }

    public String getTitle(){
        return title;
    }

    public String getDate(){
        return date;
    }

    public double getIncome(){
        return income;
    }

    public double getProductionCost(){
        return productionCost;
    }

    public double getProductionIndex()
    {
        calculateProductionIndex();
        return productionIndex;
    }

    private void calculateProductionIndex(){
        double pidx = income / productionCost; 
        productionIndex = pidx;
    }
}