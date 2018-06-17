properties([
  parameters([
    string(defaultValue:'',description:'',name:'ACTION',trim:true),
    booleanParam(defaultValue:false,description:'',name:'DRY_RUN')
  ])
])

pipeline{
  agent any 
  stages{
    stage('test'){
      steps{
        echo "Hello it's calculator, branch master"
        echo "JOB NAME: $JOB_NAME"
        echo "DRY RUN : $DRY_RUN"
        echo "ACTION: $ACTION"
      }
    }
  }
}
