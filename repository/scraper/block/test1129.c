int test(int ret, int q){
if ( q   - >   nr_pending )     { ret = -   EBUSY ;  pm_runtime_mark_last_busy ( q    -  >       dev )    ;  }    }