const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmm78s3/",
            name: "ssmm78s3",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmm78s3/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "在线交友系统"
        } 
    }
}
export default base
