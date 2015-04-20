int test(int base_slice, int CFQ_SLICE_SCALE){
return base_slice    +  ( base_slice   /  CFQ_SLICE_SCALE   *  ( 4    -  prio      )    )      ;}