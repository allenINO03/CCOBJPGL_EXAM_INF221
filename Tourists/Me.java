package Tourists;


import Locations.*;

public class Me implements Tourist {

    static int budget = 1000;
    

    public void visit() {
        System.out.print("Enjoying my Vacation");
    }

    public void visit(Boracay boracay) {
        System.out.println("may kwarta is " + getBudget());

        if ( budget > boracay.airFare  ){
            System.out.println("arat self sa Boracay" );
            budget -= boracay.airFare;
            
        }else{
            System.out.println("for sale kidney pang gala, umay ala na pera");
        }

      checkBudget();
        
    }

    public void visit(Bohol bohol) {

        if(budget >bohol.airFare){
            System.out.println("kaya pa makagala sa Bohooool");
            budget -= bohol.airFare;
        }else{
            System.out.println("Bilis ng Kwarta ay! la na kwarta huhuhuhu");
        }

        checkBudget();
    }
    public void visit(Cebu cebu) {
        if(budget >cebu.airFare){
            System.out.println("Cebu will see youuuu soooon");
            budget -= cebu.airFare;
        }else{
            System.out.println("nak ng! ala na naman kwarta ay");
        }

        checkBudget();
    }

    public void visit(Palawan palawan) {
        if(budget >palawan.airFare){
            System.out.println("Palawan for the gooooooo");
            budget -= palawan.airFare;
        }else{
            System.out.println("fly high my kwarta, may you rest in peace");
        }

        checkBudget();
    }

    public void visit(Siargao siargao) {
        if(budget >siargao.airFare){
            System.out.println("Arat sa Siargao self, looking for peace of mind");
            budget -= siargao.airFare;
        }else{
            System.out.println("may peace of mind nga, wala naman pera");
        }

        checkBudget();
    }

    public void visit(Vigan vigan) {
        if(budget >vigan.airFare){
            System.out.println("arat mag longganisa sa Vigan naman");
            budget -= vigan.airFare;
        }else{
            System.out.println("ubos na naman ang kwarta ay");
        }

        checkBudget();
    }

    public void checkBudget() {
        System.out.println("kwarta cheeeeck " + budget);
    }

    public static int getBudget() {
        return budget;
    }


}