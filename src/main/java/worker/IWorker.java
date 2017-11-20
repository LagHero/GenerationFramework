package worker;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by Aaron Gehri on 11/18/2017.
 */
public interface IWorker {

    List<Integer> attributes = Lists.newArrayList();

    public List<Integer> getAttributes();

}
