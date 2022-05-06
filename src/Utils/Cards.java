package Utils;
import java.io.*;

import Utils.IContainer;
import Utils.Iterator;

import java.util.ArrayList;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Cards implements IContainer {
    ArrayList<String> creditcardsData = new ArrayList<String>();
    private static Cards cardsObject = new Cards();

    private Cards() {
        try {
            Path currentRelativePath = Paths.get("");
            String s = currentRelativePath.toAbsolutePath().toString();
            String strNew = s.substring(0, s.length()-4);
            BufferedReader bufferreader1 = new BufferedReader(new FileReader(strNew+ "/resources/CreditCards.csv"));
                String line1="";
                while(true){
                    line1=bufferreader1.readLine();
                    if(line1==null)
                        break;
                    if(line1.equals("CardNumber")){
                        line1=bufferreader1.readLine();
                    }
                    else{
                        creditcardsData.add(line1);
                    }
                }
                bufferreader1.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static Cards getInstance() {
        return cardsObject;
    }
    public ArrayList<String> getCardsList() {
        return creditcardsData;
    }
    public void setCardsList(ArrayList<String> creditcardsData) {
        this.creditcardsData = creditcardsData;
    }
    
    @Override
    public Iterator createIterator() {
        CardsIterator result = new CardsIterator();
        return result;
    }

    public class CardsIterator implements Iterator {
        private int position = 0;

        @Override
        public boolean hasNext() {
            if(creditcardsData.size()>0 && position < creditcardsData.size())
                return true;
            else
                return false;

        }

        @Override
        public Object next() {
            if(this.hasNext()) {
                String cardNumber = creditcardsData.get(position);
                position++;
                return cardNumber;
            } else {
                return false;
            }
        }
    }
}