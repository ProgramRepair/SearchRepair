int test(int artno, int hd, int BDEVNAME_SIZE, int buf){
if ( artno     )     snprintf ( buf       , BDEVNAME_SIZE       , "%s"  , hd    -  >       disk_name )    ;    }