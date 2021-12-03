/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.Scanner;

/**
 *
 * @author Amanda Lima
 */
public class Equations2Variables {
    private float[][] originalEquation = new float[2][2];
    private float[] resultColum = new float[2];
    private float[][] detAEquation = new float[2][2];
    private float detA;
    private float[][] inverse = new float [2][2];
    private float[] results = new float [2];
    
    public void Equations2Variable(){
        Scanner scan = new Scanner(System.in);
        System.out.println("x");
        this.originalEquation[0][0] = scan.nextFloat();
        System.out.println("y");
        this.originalEquation[0][1] = scan.nextFloat();
        System.out.println("Result");
        this.resultColum[0] = scan.nextFloat();
        System.out.println("x again");
        this.originalEquation[1][0] = scan.nextFloat();
        System.out.println("y again");
        this.originalEquation[1][1] = scan.nextFloat();
        System.out.println("Result again");
        this.resultColum[1] = scan.nextFloat();
               
    }

    public void setInverse(float[][] inverse) {
        this.inverse = inverse;
    }

    public void setResults(float[] results) {
        this.results = results;
    }

    public float[][] getInverse() {
        return inverse;
    }

    public float[] getResults() {
        return results;
    }
    

    public void setDetA(float detA) {
        this.detA = detA;
    }

    public float getDetA() {
        return detA;
    }

    public void setOriginalEquation(float[][] originalEquation) {
        this.originalEquation = originalEquation;
    }

    public void setDetAEquation(float[][] detAEquation) {
        this.detAEquation = detAEquation;
    }

    public float[][] getOriginalEquation() {
        return originalEquation;
    }

    public float[][] getDetAEquation() {
        return detAEquation;
    }

    public void findDetA() {
        this.getOriginalEquation();
        this.setDetA((this.originalEquation[0][0]*this.originalEquation[1][1])-(this.originalEquation[0][1]*this.originalEquation[1][0]));
        
    }

    public void newArray() {
        this.detAEquation[0][0]= this.originalEquation[1][1];
        this.detAEquation[0][1]= this.originalEquation[0][1]*-1;
        this.detAEquation[1][1]= this.originalEquation[0][0];
        this.detAEquation[1][0]= this.originalEquation[1][0]*-1;
        
    }

    public void findTheInverse() {

        for(int row = 0; row < detAEquation.length; row++){
            for(int col = 0; col < detAEquation[row].length; col++){
                this.inverse[row][col]= (1/detA) * this.detAEquation[row][col]; 
            }
        }
        
    }

    public void variablesResults() {
        
//        for(int row = 0; row < inverse.length; row++){
//            for(int col = 0; col < inverse[row].length; col++){
//                this.results[row]= (this.inverse[row][0]*this.resultColum[0])+(this.inverse[row][1]*this.resultColum[1]);
//                }
//        }
                this.results[0]= (this.inverse[0][0]*this.resultColum[0])+(this.inverse[0][1]*this.resultColum[1]);
                this.results[1]= (this.inverse[1][0]*this.resultColum[0])+(this.inverse[1][1]*this.resultColum[1]);
                System.out.println(results[0] +", "+results[1]);       
    }

}

