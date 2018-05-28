package xyz.typing365;

import java.time.LocalDateTime;

public class VisitCount {


    public VisitCount() {
    }

    public long getCounter(VisitCounterRepository visitCounterRepository) {
        visitCounterRepository.save(new VisitCounter(LocalDateTime.now()));
        return visitCounterRepository.count();
    }
}