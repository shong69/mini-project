import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{


    // 루트 애플리케이션 컨텍스트 설정 (예: 서비스 계층, 데이터소스 등)
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{WebConfig.class}; // 루트 설정 파일
    }

    // 서블릿 애플리케이션 컨텍스트 설정 (Spring MVC 설정)
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class}; // Spring MVC 설정 파일
    }

    // 서블릿 매핑 설정
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};  // 모든 요청을 DispatcherServlet이 처리하도록 설정
    }

}
