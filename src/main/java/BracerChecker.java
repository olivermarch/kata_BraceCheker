public class BracerChecker {


    public boolean stringValidator(String givenText) {

        if(givenText.isEmpty()){
            return false;
        }
        if( givenText.contains( "(" ) ||
            givenText.contains( ")" ) ||
            givenText.contains( "[" ) ||
            givenText.contains( "]" ) ||
            givenText.contains( "{" ) ||
            givenText.contains( "}" )){


            return true;
        }
        return false;
    }

}
