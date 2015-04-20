void test(int BLOCK_IOPOLL_SOFTIRQ, int rearm){
if ( rearm     )     __raise_softirq_irqoff ( BLOCK_IOPOLL_SOFTIRQ       )    ;    }