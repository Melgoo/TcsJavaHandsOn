import java.util.Scanner;
import java.util.Arrays;

public class MedicinePriceSolution {
 public static void main(String[] args) {
	 //create medicine array of object of Medicine class
  Medicine[] medicine = new Medicine[4];
  String search;
  Scanner sc = new Scanner(System.in);
  //input the variables of Medicine class
  for (int i = 0; i < medicine.length; i++) {
   String medicineName = sc.nextLine();
   String batchNo = sc.nextLine();
   String disease = sc.nextLine();
   int price = sc.nextInt();
   sc.nextLine();
   medicine[i] = new Medicine(medicineName, batchNo, disease, price);
  }
  //take input from user for search disease.....
  search = sc.nextLine();
  //close the scanner class
  sc.close();
  // price integer array for "medicinePriceForGivenDisease" function and two parameter pass
  Integer[] price = medicinePriceForGivenDisease(medicine, search);
  //loop for print the "price"output....
  for(int i=0;i<price.length;i++) {
 System.out.println(price[i]);
 }
 }
 //create "medicinePriceForGivenDisease" function for main logic
 public static Integer[] medicinePriceForGivenDisease(Medicine[] medicine,String disease ){
  //method logic
    Integer[] result=new Integer[0];
    for (int i = 0; i < medicine.length; i++) {
    	//check disease are match or not
    	if(medicine[i].getDisease().equalsIgnoreCase(disease))
    	{
    		//if matched then stored it in "result"array
    		result=Arrays.copyOf(result,result.length+1);
    		// get the price which disease already matched.... 
    		result[result.length-1]=medicine[i].getPrice();
    	}
    }
    //code to find price, sort and return the sorted array.
    Arrays.sort(result);
    return result;
 }
}
// create Medicine class
class Medicine
{
  //code to build Medicine class
	// initialize variables of  Medicine class
  String medicineName;
  String batchNo;
  String disease ;
  int price;
  //get disease
  public String getDisease()
  {
    return disease;
  }
  //get price
  public int getPrice()
  {
    return price;
  }
  //medicine Parameterized constructor
  Medicine(String medicineName,String batchNo,String disease,int price)
  {
    this.medicineName=medicineName;
    this.batchNo=batchNo;
    this.disease=disease;
    this.price=price;
  }
}