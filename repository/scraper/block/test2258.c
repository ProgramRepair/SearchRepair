void test(int next_cpu, int nr_cpu_ids){
if ( next_cpu  >=  nr_cpu_ids     )     next_cpu = cpumask_first ( hctx    -  >       cpumask )          ;    }