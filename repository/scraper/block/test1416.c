int test(int ioc, int task){
if ( likely ( ioc       )       )     { get_io_context ( ioc       )    ;  task_unlock ( task       )    ;  return ioc       ;  }    }