import java.util.*;
import java.lang.*;
class RnaTranscription {

    String transcribe(String dnaStrand) {

        String rnaStrand = "";

        //Check if String is not empty
        if(dnaStrand.length() >= 1){
                    
        for(int i=0;i<dnaStrand.length();i++){
            if(dnaStrand.charAt(i) == 'G'){
                rnaStrand += "C";
            }
            else if(dnaStrand.charAt(i) == 'C'){
                rnaStrand += "G";
            }
            else if(dnaStrand.charAt(i) == 'T'){
                rnaStrand += "A";
            }
            else if(dnaStrand.charAt(i) == 'A'){
                rnaStrand += "U";
            }
        }
        return rnaStrand;
            
        }
        // Return Empty String if string is empty
        else{
            return "";
        }
    }

}
