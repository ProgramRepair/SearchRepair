int test(int bdevp, int EBUSY, int devp){
if ( bdevp   - >   bd_openers )     { mutex_unlock ( devp    -  >       bd_mutex )    ;  bdput ( bdevp       )    ;  return   -  EBUSY        ;  }    }