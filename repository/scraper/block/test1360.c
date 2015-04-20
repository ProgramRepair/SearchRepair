void test(int integrity_cachep){
integrity_cachep = kmem_cache_create ( "blkdev_integrity"  , sizeof ( struct   blk_integrity     )         , 0       , SLAB_PANIC       , NULL       )         ;}