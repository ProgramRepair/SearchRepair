int test(int base_slice, int CFQ_SLICE_SCALE, int prio){
return base_slice    +  ( base_slice   /  CFQ_SLICE_SCALE   *  ( 4    -  prio      )    )      ;}