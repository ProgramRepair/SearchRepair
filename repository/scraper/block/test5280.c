int test(int ysfs_deprecated, int block_depr){
if ( ysfs_deprecated     )     sysfs_remove_link ( block_depr       , dev_name ( disk_to_dev ( disk       )         )         )    ;    }