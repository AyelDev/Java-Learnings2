package data_types;

public class DataTypes implements ITopics {

    @Override
    public String Primitive_Data_Types() {
        //Showing Different Datatypes
        byte by = 5;
        short sh = 10;
        int in = 10;
        double db = 10.113;
        float fl = 100.83f;
        char ch = 'K';
        long ln = 10000;
        return String.format(
            "byte range Min-Max: %d - %d\n"+
            "byte set value: %d\n"+

            "short range Min-Max: %d - %d\n"+
            "short set value: %d\n"+
            
            "int range Min-Max: %d - %d\n"+
            "int set value: %d\n"+
            
            "double range Min-Max: %f - %f\n"+
            "double set value: %f\n"+
            
            "long range Min-Max: %d - %d\n"+
            "long set value: %d \n"+

            "float range Min-Max: %.2f - %.2f\n"+
            "float set value: %.2f\n"+
            
            "char range Min - Max Code Point: %s - %s\n"+
            "char set value: %s",
           
            Byte.MIN_VALUE, Byte.MAX_VALUE, by,
            Short.MIN_VALUE, Short.MAX_VALUE, sh,
            Integer.MIN_VALUE, Integer.MAX_VALUE, in,
            Double.MIN_VALUE, Double.MAX_VALUE, db,
            Long.MIN_VALUE, Long.MAX_VALUE, ln,
            Float.MIN_VALUE, Float.MAX_VALUE, fl,
            Character.MIN_CODE_POINT, Character.MAX_CODE_POINT, ch);            
         
        
    }


    
}
