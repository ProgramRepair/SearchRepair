int test(int ioc, int ioprio){
if ( ioc     )     {  ioc - >  ioprio = ioprio        ;  put_io_context ( ioc       )    ;  }    }