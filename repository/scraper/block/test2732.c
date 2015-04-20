int test(int max_hw_sectors_kb, int max_sectors_kb, int page_kb, int EINVAL){
if ( max_sectors_kb  >  max_hw_sectors_kb    || max_sectors_kb  <  page_kb      )     return   -  EINVAL        ;    }