void test(int ret){
ret = idr_alloc ( sg_minor_idr       , bcd       , 0       , BSG_MAX_DEVS       , GFP_KERNEL       )         ;}