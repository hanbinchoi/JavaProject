package d.generic;

public class GenericSample {
    public static void main(String[] args){
        GenericSample sample = new GenericSample();
        sample.checkCastingDTO();
    }


    public void checkCastingDTO(){
        CastingDTO dto1= new CastingDTO();
        dto1.setObject(new String());

        CastingDTO dto2= new CastingDTO();
        dto2.setObject(new StringBuffer());

        CastingDTO dto3= new CastingDTO();
        dto3.setObject(new StringBuffer());


    }

    public void checkDTO(CastingDTO dto){
        Object termObject = dto.getObject();
        if(termObject instanceof StringBuffer){
            System.out.println("StringBuffer");
        }else if(termObject instanceof StringBuilder){
            System.out.println("StringBuilder");
        }
    }

    public void checkGenericDTO(){
        CastingGenericDTO<String> dto1 = new CastingGenericDTO<>();
        dto1.setObject(new String());
        CastingGenericDTO<StringBuffer> dto2 = new CastingGenericDTO<>();
        dto2.setObject(new StringBuffer());
        CastingGenericDTO<StringBuilder> dto3 = new CastingGenericDTO<>();
        dto3.setObject(new StringBuilder());
        String temp = dto1.getObject();
        StringBuffer temp2 = dto2.getObject();
        StringBuilder temp3 = dto3.getObject();
    }
}
