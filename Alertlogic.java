/*-------------------------------------------------------------------
@author Rajaul Karim
@copyright (C) 2018, <COMPANY>
@doc

@end
Created : 01. Mar 2018 20:53
-------------------------------------------------------------------*/


import java.util.Arrays;

public class Alertlogic {

    public static void main(String[] args){
        int[] encryption= {118,219,190,154,229,126,78,185,193,156,221,196,143,234,199,154,215,198,151,229,192,161,150,184,157,232,114,161,229,190,164,223,192,
                149,150,198,150,219,114,111,226,183,160,234,114,122,229,185,151,217,114,145,222,179,154,226,183,156,221,183,92,150,162,154,219,179,161,219,114,
                161,219,192,146,150,203,157,235,196,78,233,193,154,235,198,151,229,192,78,215,192,146,150,149,132,150,198,157,150,198,143,226,183,156,234,179,
                145,231,199,151,233,187,162,223,193,156,182,179,154,219,196,162,226,193,149,223,181,92,217,193,155,150,195,163,229,198,151,228,185,78,232,183,
                148,219,196,147,228,181,147,176,114,102,232,199,134,235,131,118,206,180,112,204,192,157,239,189,146,173,165,166,208,183,127,200,162,164,240,
                179,162,227,186,167,207,147,162,186,159,157,201};

        int[] decrypted = decrypt(encryption, /* add A value here*/, /* add B value here*/, /* add C value here*/, 0);
        for (int i : decrypted) {
            System.out.print(Character.toString((char) i));
        }
    }

    private static int[] decrypt(int encryption[], int a, int b, int c, int index) {
        switch (index % 3) {
            case 0: encryption[index] = (encryption[index] - a) % 256;
                break;
            case 1: encryption[index] = (encryption[index] - b) % 256;
                break;
            case 2: encryption[index] = (encryption[index] - c) % 256;
                break;
        }
        if(index != encryption.length-1) decrypt(encryption, a, b, c, index+1);
        return encryption;
    }
}
