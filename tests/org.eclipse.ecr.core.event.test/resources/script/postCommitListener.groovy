
bundle.each
{
    org.eclipse.ecr.core.event.test.PostCommitEventListenerTest.SCRIPT_CNT++;
    System.out.println("Hello from a post commit Groovy listener. Event name: "+ it.name + ". CNT: "+org.eclipse.ecr.core.event.test.PostCommitEventListenerTest.SCRIPT_CNT);
}
