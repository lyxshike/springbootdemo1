参数校验
    MethodValidationPostProcessor 和 BeanValidationPostProcessor 可以互换注入springboot容器中
    方法参数校验抛ConstraintViolationException， VO类的属性校验抛MethodArgumentNotValidException
    当要对方法参数校验的时候，必须在当前类上加上 @Validated
    当要对VO类的属性校验时，需要在VO类引用的地放加上 @Valid 或者 @Validated



BeanPostProcessor

        2021-01-16 20:40:22.544  INFO 5564 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1291 ms
    {MyInstantiationAwareBeanPostProcessor}-[postProcessBeforeInstantiation]
    TestBean 属性赋值
    TestBean 构造方法执行
    {MyMergedBeanDefinitionPostProcessor}-[postProcessMergedBeanDefinition]
    {MyInstantiationAwareBeanPostProcessor}-[postProcessAfterInstantiation]
    {MyInstantiationAwareBeanPostProcessor}-[postProcessProperties]
    {MyBeanPostProcessor}-[postProcessBeforeInitialization]
    afterPropertiesSet 方法执行
    init 方法执行
    {MyBeanPostProcessor}-[postProcessAfterInitialization]
        2021-01-16 20:40:22.889  INFO 5564 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
        2021-01-16 20:40:23.076  WARN 5564 --- [           main] ion$DefaultTemplateResolverConfiguration : Cannot find template location: classpath:/templates/ (please add some templates or check your Thymeleaf configuration)
        2021-01-16 20:40:23.092  WARN 5564 --- [           main] org.thymeleaf.templatemode.TemplateMode  : [THYMELEAF][main] Template Mode 'HTML5' is deprecated. Using Template Mode 'HTML' instead.
        2021-01-16 20:40:23.237  INFO 5564 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
        2021-01-16 20:40:23.252  INFO 5564 --- [           main] c.e.s.SpringbootdemoApplication          : Started SpringbootdemoApplication in 2.471 seconds (JVM running for 3.204)
        Disconnected from the target VM, address: '127.0.0.1:51992', transport: 'socket'
        2021-01-16 20:41:24.495  INFO 5564 --- [extShutdownHook] o.s.s.concurrent.ThreadPoolTaskExecutor  : Shutting down ExecutorService 'applicationTaskExecutor'
    {MyDestructionAwareBeanPostProcessor}-[postProcessBeforeDestruction]
    destroy 方法执行
    destroys 方法执行





