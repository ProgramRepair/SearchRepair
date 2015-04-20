int test(int local_nr_pages, int ret){
if ( ret  <  local_nr_pages     )     { ret = -   EFAULT ;   goto  out_unmap ;  }    }