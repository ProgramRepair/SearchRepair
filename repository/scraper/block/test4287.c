int test(int cfqq, int base_rq, int IOPRIO_BE_NR){
return 2   *  base_rq   *  ( IOPRIO_BE_NR    -  cfqq     -  >     ioprio )     ;}