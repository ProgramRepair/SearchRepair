void test(int isa_page_pool){
isa_page_pool = mempool_create ( ISA_POOL_SIZE       , mempool_alloc_pages_isa       , mempool_free_pages       , ( void   *     )  0     )         ;}