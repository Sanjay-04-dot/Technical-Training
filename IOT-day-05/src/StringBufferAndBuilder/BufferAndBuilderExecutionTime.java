package StringBufferAndBuilder;

public class BufferAndBuilderExecutionTime {
    public static void main(String[] args) {

        System.out.println("Buffer");
        long starttime=System.currentTimeMillis();

        StringBuffer bf=new StringBuffer("Placement ");

        for(int i=0;i<1000000;i++)
        {
            bf.append("Training");
        }

        System.out.println("Time taken is: "+(System.currentTimeMillis()-starttime));

        System.out.println("Builder");
        starttime=System.currentTimeMillis();

        StringBuilder build=new StringBuilder("Placement ");

        for(int i=0;i<1000000;i++)
        {
            build.append("Training");
        }

        System.out.println("Time taken is: "+(System.currentTimeMillis()-starttime));

    }
}
