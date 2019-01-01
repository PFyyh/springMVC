package top.pofengsystem.data;

import top.pofengsystem.model.Spittle;

import java.util.List;

public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);
}
