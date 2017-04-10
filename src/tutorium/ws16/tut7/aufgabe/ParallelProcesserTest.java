package ws16.tut7.aufgabe;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by proj on 1/8/17.
 */
public class ParallelProcesserTest {
    @Test
    public void TestRun()
    {
        Integer[] data = new Integer[250000], nd;
        for (int i = 0; i < 250000; i++)
            data[i] = i;

        ParallelProcessor<Integer> pp = new ParallelProcessor<Integer>(data, 4, false, new Processor<Integer>() {
            @Override
            public Integer process(Integer input) {
                return 1;
            }
        });

        pp.processInput();

        nd = pp.getInput();
        for(Integer i : nd)
            assertEquals(i, (Integer)1);
    }

    @Test
    public void TestRunWithBuilder() throws ParallelProcessorBuilder.InvalidDataException {
        Integer[] data = new Integer[250000], nd;
        for (int i = 0; i < 250000; i++)
            data[i] = i;

        ParallelProcessorBuilder<Integer> builder = ParallelProcessorBuilder.create();

        ParallelProcessor<Integer> pp = builder
                .withData(data)
                .withPrint(false)
                .withThreads(2)
                .withProcessor(new Processor<Integer>() {
                    @Override
                    public Integer process(Integer input) {
                        return 1;
                    }
                })
                .build();


        pp.processInput();

        nd = pp.getInput();
        for(Integer i : nd)
            assertEquals(i, (Integer)1);
    }
}
