public class DefangedIpAddress {
    public String defangIPaddr(String address) {
        String replaceString = address.replace(".", "[.]");
        return replaceString;
        
        
    }
    public static void main(String[] args) {
        DefangedIpAddress defangedIpAddress = new DefangedIpAddress();
        defangedIpAddress.defangIPaddr("1.1.1.1");
    }  
}
