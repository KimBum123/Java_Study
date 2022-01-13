package chapter_04;

public class ToCharArray {

	public static void main(String[] args) {
		String dna = "GATCCGCCCGCCTCGGCCTCCCAAAGTGCTGGGATTACAGGTGTGAGCCA"
                + "CCACGCCCGGCTAATTTTTATTTATTTATTTAAAGACAGAGTCTCACTCT"
                + "GTCACTCAGGCTAGAGTGCAGTGGCACCATCTCAGCTCACTGCAGCCTTG"
                + "ACCTCCCTGGGCTCCGGTGATTTCACCCTCCCAAGTAGCTAGGACTACAG"
                + "GCACATGCCACGACACCCAGCTAATTTTTTATTTTCTGTGAAGTCAAGGT"
                + "CTTGCTACGTTGCCCATGCTGGTATCAAACCCCTGGGCTCAATCAATCCT"
                + "TCCACCTCAGCCTCCCCAAGTATTGGGGTTACAGGCATGAGCTACCACAC"
                + "TCAGCCCTAGCCTACTTGAAACGTGTTCAGAGCATTTAAGTTACCCTACA"
                + "GTTGGGCAAAGTCATCTAACACAAAGCCCTTTTTATAGTAATAAAATGTT"
                + "GTATATCTCATGTGATTTATTGAATATTGTTACTGAAAGTGAGAAACAGC"
                + "ATGGTTGCATGAAAGGAGGCACAGTCGAGCCAGGCACAGCCTGGGCGCAG"
                + "AGCGAGACTCAAAAAAAGAAAAGGCCAGGCGCACTGGCTCACGCCTGTAA"
                + "TCCCAGCATTTCGGGAGGCTGAGGCGGGTGGATCACCTGAGGTCAGGAGT"
                + "TCAAGACCAGCCTAGCCAACATGGTGAAACCCCGTCTCTACTAAAATACA"
                + "AAAATTAACCGGGCGTGATGGCAGGTGCCTGTAATCCCAGCTACTTGGGA"
                + "GGCTGAGGCAGGAGAATCGCTTGAACCAGGAGGCGGAGGTTGCAGGGAGC"
                + "CAAGATGGCGCCACTGCACTCCAGCCTGGGCGATAGAGTGAGACTCCGTC"
                + "TCAGAAAAAAAAGAAAAGAAACGAGGCACAGTCGCATGCACATGTAGTCC"
                + "CAGTTACTTGAGAGGCTAAGGCAGGAGGATCTCTTGAGCCCAAGAGTTTG"
                + "AGTCCAGCCTGAACAACATAGCAAGACATCATCTCTAAAATTTAAAAAAG"
                + "GGCCGGGCACAGTGGCTCACACCTGTAATCCCAGCACTTTGGGAGGTGGA"
                + "GGTGGGTAGATCACCTGACGTCAGGAGTTGGAAACCAGCCTGGCTAACAT";
     char[] charArray = dna.toCharArray();
     
     int counter_TAGG = 0;
     int counter_CCAG = 0;
     int counter_AGCC = 0;
     
     String TAGG = "TAGG";
     String CCAG = "CCAG";
     String AGCC = "AGCC";
     
     
     
     for(int i = 0; i < (charArray.length)-4; i ++)
     {
         
    	 String ArrDNA = "";
    	 for(int j = i; j < i+4; j++)
    	 {
    		 ArrDNA += Character.toString(charArray[j]);
    	 }
    	 
    	 
    	 if(ArrDNA.equals(TAGG))
    	 {
    		 counter_TAGG++;
    	 }
    	 
    	 else if(ArrDNA.equals(CCAG))
    	 {
    		 counter_CCAG++;
    	 }
    	 
    	 else if(ArrDNA.equals(AGCC))
    	 {
    		 counter_AGCC++;
    	 }
     }
     
     System.out.println("TAGG: "+counter_TAGG);
     System.out.println("CCAG: "+counter_CCAG);
     System.out.println("AGCC: "+counter_AGCC);
     
     
     
	}

}
