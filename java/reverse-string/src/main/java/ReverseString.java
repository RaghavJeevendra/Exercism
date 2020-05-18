class ReverseString {

    String reverse(String inputString) {
        StringBuffer buf = new StringBuffer(inputString);
        buf.reverse();

        return buf.toString();

    }
  
}
